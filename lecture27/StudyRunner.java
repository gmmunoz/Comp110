package comp110.lecture27;

public class StudyRunner {

  public static void main(String[] args) {

    Sample subject = StudyRunner.generateSampleA();
    Study study = new Study(subject, 2);
    study.addCandidate(StudyRunner.generateSampleB());
    study.addCandidate(StudyRunner.generateSampleC());
    System.out.println(subject + "'s likely ancestors are: " + study.getAncestors());

  }

  /*
   * The following methods are provided to you for testing purposes.
   */

  public static Sample generateSampleA() {
    Sample sample = new Sample("Baby Doe");
    sample.addAllele("AA");
    sample.addAllele("AA");
    sample.addAllele("AA");
    sample.addAllele("AT");
    sample.addAllele("AT");
    sample.addAllele("TA");
    sample.addAllele("TC");
    sample.addAllele("TG");
    sample.addAllele("GT");
    sample.addAllele("TT");
    return sample;
  }

  public static Sample generateSampleB() {
    Sample sample = new Sample("John Doe");
    sample.addAllele("GG");
    sample.addAllele("GG");
    sample.addAllele("GG");
    sample.addAllele("AT");
    sample.addAllele("AT");
    sample.addAllele("TA");
    sample.addAllele("TC");
    sample.addAllele("TG");
    sample.addAllele("GT");
    sample.addAllele("TT");
    return sample;
  }

  public static Sample generateSampleC() {
    Sample sample = new Sample("John Smith");
    sample.addAllele("GG");
    sample.addAllele("GG");
    sample.addAllele("GG");
    sample.addAllele("AT");
    sample.addAllele("AG");
    sample.addAllele("TA");
    sample.addAllele("TC");
    sample.addAllele("TG");
    sample.addAllele("GT");
    sample.addAllele("TT");
    return sample;
  }

}
