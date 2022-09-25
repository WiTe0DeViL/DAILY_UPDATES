package cricketConsoleApplication;

public class Team {
    private String[][] Teams = {{"India", "KL Rahul(c)", "Rishabh Pant(w)",
            "Virat Kohli", "Suryakumar Yadav",
            "Deepak Hooda", "Dinesh Karthik",
            "Axar Patel", "Ravichandran Ashwin",
            "Bhuvneshwar Kumar", "Deepak Chahar",
            "Arshdeep Singh"}, {"Australia", "Aaron Finch(c)", "Pat Cummins (vc)",
            "Ashton Aga", "Tim David",
            "Josh Hazlewood", "Josh Inglis (wk)",
            "Glenn Maxwell", "Kane Richardson",
            "Steve Smith", "Marcus Stoinis",
            "David Warner"}};


    class TeamsPlaying {
        int NumberOfPlayers = 11, NumberOfTeam = 2;

        Player[][] teams;

        public TeamsPlaying() {
            AssignTeam();
        }

        private void setTeam(Player[][] team) {
            this.teams = team;
        }

        public Player[][] getTeam() {
            return teams;
        }

        private void AssignTeam() {

            Player[][] team = new Player[NumberOfTeam][NumberOfPlayers];
            for (int i = 0; i < Teams.length; i++) {
                int ind = 0;
                for (int j = 1; j < Teams[i].length; j++) {
                    team[i][ind++] = new Player(Teams[i][j], Teams[i][0]);
                }
                System.out.println();
            }

            setTeam(team);

        }
    }

}