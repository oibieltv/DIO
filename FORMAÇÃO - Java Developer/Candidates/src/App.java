import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    final static private double BASE_SALARY = 2000.0;
    final static private int MAX_CANDIDATES = 5;
    final static private int MAX_CALL_TRIES = 3;


    public static void main(String[] args) throws Exception {

        Candidate[] candidateList, selectedCandidates;
         
        candidateList = generateCandidateList(10);
        selectedCandidates = selectedCandidate(candidateList);

        for(Candidate c : selectedCandidates){
            if(c != null) call(c);
        }
    }


    private static void call(Candidate _c) {
        int tries = 0;
        boolean keepTrying = true;
        boolean called = false;

        do{
            called = hello();
            keepTrying = !called;
            if(keepTrying)
                tries++;
            else break;
        }while (tries < MAX_CALL_TRIES);

        if(called) System.out.println("CANDIDATO " + _c.getName() + " CONTATADO");
        else System.out.println("CANDIDATO " + _c.getName() + " NaO CONTATADO APoS " + MAX_CALL_TRIES + " TENTATIVAS!");
    }


    private static boolean hello() {
        return new Random().nextBoolean();
    }






    private static Candidate[] generateCandidateList(int _numberOfcandidates) {
        int count = 0;
        Candidate[] tempList = new Candidate[_numberOfcandidates];
        
        String[] nameList = 
        {"FELIPE",
          "MARCIA",
           "JUIA",
            "PAULO",
             "AUGUSTO",
              "MONICA",
               "FABRICIO",
                "MIRELA",
                 "DANIELA",
                  "JORGE"};

        while(count < _numberOfcandidates){
            tempList[count] = new Candidate();
            tempList[count].setName(nameList[count]);
            count++;
        }

        return tempList;
    }

    private static Candidate[] selectedCandidate(Candidate[] _candidateList) {
        Candidate[] tempList = new Candidate[MAX_CANDIDATES];
        int count = 0;

        for (Candidate c : _candidateList) {
            if (count >= MAX_CANDIDATES) break; 

            c.setPretendSalary(RandomSalary());

            if (c.getPretendSalary() <= BASE_SALARY) {
                tempList[count] = c;
                count++; 
            }
        }
        return tempList;
    }

    private static double RandomSalary() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200); 
    }
}
