package comp110.lecture27;

public class SampleRunner {

  public static void main(String[] args) {

    // TODO: Test Sample methods here.
    Sample subject = new Sample("Jane Doe");
    System.out.println("Subject: " + subject);

    subject.addAllele("AA");
    subject.addAllele("AA");
    subject.addAllele("AA");
    subject.addAllele("TT");
    subject.addAllele("TT");
    subject.addAllele("CC");
    subject.addAllele("GG");
    System.out.println("Alleles: " + subject.getAlleles());

    // TODO: Test countAlleles()
    System.out.println("Allele Counts: " + subject.countAlleles());

    // TODO: Test filterAlleles()
    System.out.println("Frequent Alleles: " + subject.filterAlleles(1));
  }

}
