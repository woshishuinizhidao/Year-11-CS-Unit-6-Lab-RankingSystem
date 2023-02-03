public class User {
    private int rank;
    private int rankProgress;

    public User() {
        rank = -8;
        if (rank == 0 || rank < -8 || rank > 8){
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        rankProgress = 0;
    }

    public int getRank() {
        return rank;
    }

    public int getProgress() {
        return rankProgress;
    }

    public int incProgress(int rankOfActivity) {
        if (rankOfActivity == 0 || rankOfActivity < -8 || rankOfActivity > 8){
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }

        if (rankOfActivity > rank) {
            if((rankOfActivity < 0 && rank < 0) || (rankOfActivity > 0 && rank > 0)){
                rankProgress += 10 * (rankOfActivity - rank) * (rankOfActivity - rank);
            }
            if(rankOfActivity > 0 && rank < 0){
                rankProgress += 10 * (rankOfActivity - rank + 1) * (rankOfActivity - rank + 1);
            }
            if (rankProgress >= 100) {
                if(rank == -1){
                    rank += 2;
                }
                if(rank != -1){
                    rank += 1;
                }
                rankProgress -= 100;
            }return rankProgress;
        }

        if (rankOfActivity == rank) {
            rankProgress += 3;
            if (rankProgress >= 100) {
                if(rank == -1){
                    rank += 2;
                }
                if(rank != -1){
                    rank += 1;
                }
                rankProgress -= 100;
            }return rankProgress;
        }

        if (rankOfActivity - rank == 1) {
            rankProgress += 1;
            if (rankProgress >= 100) {
                if(rank == -1){
                    rank += 2;
                }
                if(rank != -1){
                    rank += 1;
                }
                rankProgress -= 100;
            }return rankProgress;
        }

        else{
            return rankProgress;
        }
    }

    public String toString (){
        return "User{" + "rank=" + -8 + ", progress=" + 0 + '}';
    }
}
