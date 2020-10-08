
/* This program is a creation of a guessing number game whether it is a larger number
or smaller number, each user has 6 tries before the number is revealed to the user
Author:Markus Baciu
*/
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;
//this class is the game where all the random number generator and displaying is done
class Game{
public:
    //the attributes
    int max_no;
    string name;
    int guesses;
    int number;
    int answer;
    //the constructor
    Game(int max_no,string name){
        this->max_no=max_no;
        this->name=name;
        this->guesses=0;
        this->number=rand() % this->max_no + 1;
        this->answer=0;
    }
    //this is for the number passed. if a number is not entered false is returned.
    bool get_guess(){
        try{
            cout<<"\nEnter your guess:";
            cin>>this->answer;
        }
        catch(exception e){
            cout<<"\nMust be a valid number\n";
            return false;
        }
        return true;
    }
    //this includes the game where the number guessing is done incremented and the range is set.
    //it displays if the answer was correct, higher or lower and if out of guesses, it will go to the end
    void play(){
        cout<<"Well "<<this->name<<", I am thinking of a number between 1 and "<<this->max_no;
        while(this->guesses<6){
                this->guesses+=1;
                if(get_guess()==true){
                    if(this->answer<this->number){
                        cout<<"\nYour guess is too low\n";
                    }
                    if(this->answer>this->number){
                        cout<<"\nYour guess is too high\n";
                    }
                    if(this->answer == this->number){
                        break;
                    }
                }
                if(this->answer == this->number){
                    cout<<"\nCongratulations "<<this->name<< ". You guessed the number in "<<this->guesses<< " guesses";
                }
                else{
                    cout<<"\nHard Luck.The number was "<<this->number;
                }
            }
        }
};
//the main where the name of the user is entered and the difficulty choice is also displayed and chosen and if user decides to quit
int main(){
    string name;
    int choice;
    cout<<"Hello, What is your name?\n";
    cin>>name;
    cout<< "Well "<<name<<", we have 2 options here\nPress 1 for easy\nPress 2 for difficult\nPress 3 to quit\n";
    cin>>choice;
    switch(choice){
        case 1: {
            Game easy(20, name);
            easy.play();
            break;
        }
        case 2: {
            Game hard(40, name);
            hard.play();
            break;
        }
        case 3: {
            cout << "Thank you for playing goodbye!";
            break;
        }
        default: {
            cout << "Please enter a value from above";
            break;
        }
    }
}
