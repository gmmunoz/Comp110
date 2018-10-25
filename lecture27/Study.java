package comp110.lecture27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Study {

	// Fields
	private Sample _subject;
	private List<Sample> _candidates;
	private int _threshold;

	// Constructor
	public Study(Sample subject, int threshold) {
		_subject = subject;
		_candidates = new ArrayList<Sample>();
		_threshold = threshold;
	}

	// Methods
	public void addCandidate(Sample sample) {
		_candidates.add(sample);
	}

	public List<Sample> getCandidates() {
		return _candidates;
	}

	public Sample getSubject() {
		return _subject;
	}

	public double getAncestorProbability(Sample candidate) {
		Set<String> candidateAlleles = candidate.filterAlleles(_threshold);
		Set<String> subjectAlleles = _subject.filterAlleles(_threshold);
		// TODO: implement formula and return result
		candidateAlleles.retainAll(subjectAlleles);
		return candidateAlleles.size() / subjectAlleles.size() / 2;
	}

	public Set<Sample> getAncestors() {
    Set<Sample> ancestors = new HashSet<Sample>();
    //TODO: Add candidates to the set whose probability is > 90%
    for(Sample candidate; _candidates){
    	if(this.getAncestorProbability(candidate) >= 0.9){
    		ancestors.add(candidate);
    	}
    }
    return ancestors;
  }
}