package cricketConsoleApplication;

import java.util.Scanner;

public class Match {
    Scanner scan = new Scanner(System.in);
    Team.TeamsPlaying TeamsPlaying = new Team().new TeamsPlaying();
    Player[][] teams = TeamsPlaying.teams;
    int NumberOfPlayers = 11;

    public void StartMatch() {
        // Displaying players
        System.out.println("=====================================================");
        DisplayPlayers(teams);
        System.out.println("=====================================================");
        System.out.printf("%-20s%n", "Match Started");
        // Match Started
        MatchStarted(teams);
    }

    private void DisplayPlayers(Player[][] Players) {
        int NumberOfTeam = TeamsPlaying.NumberOfTeam;
        for (int i = 0; i < NumberOfTeam - 1; i++) {
            System.out.printf("|%-25s|%-25s| %n", Players[i][0].getContryname(), Players[i + 1][0].getContryname());
            System.out.println("=====================================================");
            for (int j = 1; j < Players[i].length - 1; j++) {
                System.out.printf("|%-25s|%-25s| %n", Players[i][j].getName(), Players[i + 1][j].getName());
            }
        }

    }

    private void MatchStarted(Player[][] teams) {
        BattingTeam(teams[0]);
    }

    private void BattingTeam(Player[] teams) {
        int Team = 0, OneOver = 6, NumberOfOvers = 2;
        String runs = "";
        Player Striker = teams[Team], NonStriker = teams[Team + 1];
        System.out.println("Striker : " + Striker.getName());
        System.out.println("Non-Striker : " + NonStriker.getName());
        for (int Over = 0; Over < NumberOfOvers; Over++) {
            for (int Ball = 1; Ball <= OneOver; Ball++) {
                System.out.print("Enter the runs : ");
                runs = scan.next();
                switch (runs) {
                    case "1":
                    case "2":
                        StrikerRun(Striker, Integer.parseInt(runs));
                        break;
                    case "4":
                    case "6":
                        StrikerRuns(Striker, Integer.parseInt(runs), Integer.parseInt(runs));
                        break;
                    case "WIDE":
                        StrikerRun(Striker, 1);
                        Ball -= 1;
                    case "NO":
                        System.out.print("FreeHit : ");
                        int run = scan.nextInt();
                        if (run == 4 || run == 6)
                            StrikerRuns(Striker, run, run);
                        else
                            StrikerRun(Striker, run);
                        Ball = Ball == 0 ? 0 : Ball - 1;
                        break;
                    case "-1":
                        System.out.println("OUT!");
                        Striker.setIsOut(true);
                        Player updatedStriker = ChangeStriker(Striker, NonStriker, teams);
                        if (Striker.getName().equals(updatedStriker.getName()))
                            System.out.println("All are out");
                        else {
                            Striker = updatedStriker;
                            System.out.printf("Now Striker will be : %-20s%n", Striker.getName());
                        }
                        break;
                    default:
                        Ball = Ball == 0 ? 0 : Ball - 1;
                        System.out.println("Not Possible Give me a correct Number");

                }
            }
//            System.out.printf("In the end of first Over striker %-20s : %3d%n", Striker.getName(), Striker.getRuns());
        }
    }

    private Player ChangeStriker(Player striker, Player nonStriker, Player[] teams) {
        for (Player player : teams) {
            if (player.getIsOut() == false && !player.getName().equals(nonStriker.getName())) {
                striker = player;
            }
        }
        return striker;

    }

    private void StrikerRuns(Player striker, int runs, int fourOrSix) {
        StrikerRun(striker, runs);
        if (fourOrSix == 4) {
            int prevNumOfFour = striker.getFour();
            striker.setFour(prevNumOfFour + 1);
        } else {
            int prevNumOfSix = striker.getSix();
            striker.setFour(prevNumOfSix + 1);
        }
    }

    private void StrikerRun(Player striker, int runs) {
        int prevRun = striker.getRuns();
        striker.setRuns(runs + prevRun);
    }
}
