package nyc.c4q.ashiquechowdhury.binarysearch;

/**
 * Created by ashiquechowdhury on 11/13/16.
 */
public class MainController {
    MainView mainView;
    int guess;
    int minValue;
    int maxValue;

    public MainController(MainActivity mainView){
        this.mainView = mainView;
        guess = 10000/2;
        minValue = 0;
        maxValue = 10000;
//        mainView.displayGuess(guess);
    }

    public void calculateGuess(boolean numberIsHigher){
        if(numberIsHigher == true){
            maxValue = guess;
            guess = (minValue+maxValue)/2;
        }
        else{
            minValue = guess;
            guess = (minValue+maxValue)/2;
        }
        mainView.displayGuess(guess);
    }
}
