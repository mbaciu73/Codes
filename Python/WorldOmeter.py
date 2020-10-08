import secrets
import time
from datetime import date, timedelta
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
import requests
from bs4 import BeautifulSoup

def getData():
    worldData = []
    tableData = []
    worldTitles = ['TotalC', 'NewC', 'TotalD', 'NewD', 'TotalR', 'NewR']

    url = "https://www.worldometers.info/coronavirus/"
    page = requests.get(url)
    soup = BeautifulSoup(page.content, "html.parser")

    results = soup.find(id='main_table_countries_yesterday')
    content = results.find_all('td')

    for item in content:
        tableData.append(item.text.strip())

    index = tableData.index('World')
    worldData = tableData[index+1:index+7]

    worldDict = dict(zip(worldTitles,worldData))

    return worldDict




def tweet(worldDict):
    yesterday = (date.today()) - timedelta(days = 1)
    yesterday = yesterday.strftime('%d-%b-%y')
    ChromeDriverPath ='/Users/mbaci/chromedriver'
    myPassword = 'SarsCov2-19'
    tweet = "Cases for {}\n\n"\
        "Total Cases: {}\nNew Cases: {}\n" \
            "Total Deaths: {}\nNew Deaths: {}\n" \
            "Total Recovered: {}\nNew Recovered: {}".format(yesterday,worldDict.get('TotalC'),worldDict.get('NewC'),
                                                             worldDict.get('TotalD'),worldDict.get('NewD'),
                                                             worldDict.get('TotalR'),worldDict.get('NewR'))
    try:
        browser = webdriver.Chrome(ChromeDriverPath)
        browser.get('https://twitter.com/login')
        browser.implicitly_wait(4)

        username_xpath = '/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[1]/label/div/div[2]/div/input'
        password_xpath = '/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[2]/label/div/div[2]/div/input'
        login_xpath = '/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div'

        username = browser.find_element_by_xpath(username_xpath)
        password = browser.find_element_by_xpath(password_xpath)

        Login = browser.find_element_by_xpath(login_xpath)
        username.click()
        username.send_keys('dailycovidcases')
        time.sleep(1)
        password.click()
        password.send_keys(myPassword)
        time.sleep(1)
        Login.click()
        time.sleep(3)
        print('t')
    except:
        print('f')

tweet(getData())


