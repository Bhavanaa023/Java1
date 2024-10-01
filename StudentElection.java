import java.util.Scanner;
public class StudentElection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] candidates={"Anurag","Sagar","Hitashree"};
        int[] votes=new int[candidates.length];
        System.out.print("Enter the number of voters: ");
        int numberOfVoters=scanner.nextInt();
        for(int i=0;i<numberOfVoters;i++) {
            System.out.println("Voter " + (i+1)+",please choose a candidate for President post:");
            for(int j=0;j<candidates.length;j++) {
                System.out.println((j+1)+"."+candidates[j]);
            }
            int vote=scanner.nextInt();
            if(vote>0&&vote<=candidates.length){
                votes[vote-1]++;
            }
            else{
                System.out.println("Invalid choice.Skippiing this voter.");
            }
        }
        System.out.println("\nElection Results:");
        for(int i=0;i<candidates.length;i++) {
            System.out.println(candidates[i]+" received "+votes[i]+" votes. ");
        }
        int maxVotes=0;
        String winner="";
        for(int i=0;i<candidates.length;i++) {
            if(votes[i]>maxVotes) {
                maxVotes=votes[i];
                winner=candidates[i];
            }
        }
        System.out.println("\nThe winner for the President post is: "+winner);
        scanner.close();
    }
}