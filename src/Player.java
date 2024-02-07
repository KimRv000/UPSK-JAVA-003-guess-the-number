public abstract class Player {
    protected String name;
    protected int[] guesses = new int[10];
    protected int guessIndex = 0;
    public abstract int  makeGuess();

    public String getName() {
        return name;
    };
    public void setName(String playerName){
        this.name = playerName;
    };
    public  int[] getGuesses(){
        return guesses;
    }
    public void addGuess(int guess) {
        if (guessIndex < guesses.length) {
            guesses[guessIndex] = guess;
            guessIndex++;
        }
    }
    public static void printGuesses(Player player) {
        int[] guesses = player.getGuesses();
        for (int guess : guesses) {
            if (guess != 0) {
                System.out.println(guess);
            } else {
                break;
            }
        }
    }
}