package com.example.quiz;

public class Questions {
    public String mQuestions[] = {
          "What rock classic begins with the tolling of a two-ton bell?",
            "Who penned the classic songs \"Bad Moon Rising\", \"Who'll Stop The Rain\", and \"Lodi\"?",
            "Who wrote the Cream classic \"Badge\"?",
            "Which song by Chubby Checker topped the charts in 1955?",
            "What song has the lyrics -\"My Maserati does one-eighty-five. I lost my license, now I don't drive\"?",
            "What rocker was raised in North Florida, and dropped out of school to join a band?",
            "What early rock anthem contained the line \"Hope I die before I get old\"?"
    };


    private String mChoices[] [] = {
            {"Back In Black", "Wish You Were Here", "Time", "Hell's Bells"},
            {"Joe Cocker", "Glenn Frye","Pete Townsend", "John Fogerty"},
            {"John Mayall & Albert Lee", "John Lennon & George Harrison", "Eric Clapton & George Harrison", "Steve Winwood & Jim Capaldi"},
            {"Hound Dog", "The Twist", "I Will Always Love You" , "Hey Jude"},
            {"I Can't Drive 55", "Life's Been Good", "Lyin' Eyes",  "Drink Alone"},
            {"Bob Dylan", "Eddie Van Halen", "Tom Petty", "Bob Seger"},
            {"Long Live Rock", "My Generation", "Southern Man", "Street Fighting Man"}




    };

    private String mcorrectChoices[] =
            {"Hell's Bells", "John Fogerty", "Eric Clapton & George Harrison", "The Twist", "Life's Been Good", "Tom Petty", "My Generation"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getcorrectAnswer(int a) {
        String answer = mcorrectChoices[a];
        return answer;
    }
}
