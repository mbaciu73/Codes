#include <iostream>
#include <stdlib.h>>
using namespace std;

class Game{
public:
    int max_no;
    string name;
    int guesses;
    int number;
    int answer;

    Game(int max_no,string name,){
        this->max_no=max_no;
        this->name=name;
        this->guesses=0;
        this->number=rand() % this->max_no + 1;
        this->answer=0;
    }
    bool get_guess(){
        try{
            cout<<"Enter your guess"
            cin>>this->answer
        }
        catch{
            cout<<"Must be a valid number"
        }
    }
};
