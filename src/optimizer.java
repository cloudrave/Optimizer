import java.util.ArrayList;

import algorithms.*;
import problems.*;
import solutions.PSOSolution;
import solutions.Solution;

public class optimizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int numEmployees = 20;
//		NurseSchedProb optProb = new NurseSchedProb(numEmployees);
		CuckooSearchOpt csAlg = new CuckooSearchOpt();
		ParticleSwarmOpt psoAlg = new ParticleSwarmOpt();
//		optAlg.solve(optProb);
	    
		/*
	    double fenceLength = 100.;
	    FenceProblem fenceProb = new FenceProblem(fenceLength);
	    csAlg.solve(fenceProb);
	    csAlg.getSolutions(fenceProb).getMostFitSolution(fenceProb).print();
	    
	    
	    double volume = 100.;
	    BoxMinAreaProb boxProb = new BoxMinAreaProb(volume);
	    csAlg.solve(boxProb);
	    csAlg.getSolutions(boxProb).getMostFitSolution(boxProb).print();
	    */
	    
	    MichaelwiczMinProb michaelwiczProb = new MichaelwiczMinProb();
	    csAlg.solve(michaelwiczProb);
	    Solution michaelwiczSol = csAlg.getSolutions(michaelwiczProb).getMostFitSolution(michaelwiczProb);
	    michaelwiczSol.print();
	    System.out.printf("Michaelwicz minimum: %f\n", michaelwiczProb.eval(michaelwiczSol));
	    
	    psoAlg.solve(michaelwiczProb);
	    ArrayList<PSOSolution> solutions = (ArrayList<PSOSolution>) psoAlg.getSolutions(michaelwiczProb).getSolutions();
	    for(PSOSolution sol : solutions) {
	    	sol.printAll();
	    }
	    Solution michaelwiczSol2 = psoAlg.getSolutions(michaelwiczProb).getMostFitSolution(michaelwiczProb);
	    michaelwiczSol2.print();
	    System.out.printf("Michaelwicz minimum: %f\n", michaelwiczProb.eval(michaelwiczSol2));
	}

}
