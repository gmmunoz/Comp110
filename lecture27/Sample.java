package comp110.lecture27;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sample {

	// Fields
	private String _name;
	private List<String> _alleles;

	// Constructor
	public Sample(String name) {
		_name = name;
		_alleles = new ArrayList<String>();
	}

	// Methods
	public String toString() {
		return _name;
	}

	public List<String> getAlleles() {
		return _alleles;
	}

	public void addAllele(String allele) {
		_alleles.add(allele);
	}

	public Map<String, Integer> countAlleles() {
		Map<String, Integer> alleles = new HashMap<String, Integer>();
		// TODO: implement logic
		for (String exists : _alleles) {
			if (alleles.containsKey(exists)) {
				int value = alleles.get(exists) + 1;
				alleles.put(exists, value);
			} else {
				alleles.put(exists, 1);
			}
		}
		return alleles;
	}

	public Set<String> filterAlleles(int threshold) {
		Map<String, Integer> counts = this.countAlleles();
		Set<String> frequent = new HashSet<String>();
		// TODO: implement logic
		for (String allele : counts.keySet()) {
			if (counts.get(allele) > threshold) {
				frequent.add(allele);
			}
		}

		return frequent;
	}

}