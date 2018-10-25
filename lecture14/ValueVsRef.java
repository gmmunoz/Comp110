package comp110.lecture14;

/*
 * Value vs. Reference Example
 */
public class ValueVsRef {

    public static void main(String[] args) {

        ValueVsRef demo = new ValueVsRef();

        int value;
        value = 0;

        int[] reference;
        reference = new int[1];
        reference[0] = 0;

        demo.assignToValue(value);
        demo.assignToReference(reference);

        System.out.println(value);
        System.out.println(reference[0]);
    }

    // Fields: None

    public ValueVsRef() {
    }

    public void assignToValue(int value) {
        value = 1;
    }

    public void assignToReference(int[] reference) {
        reference[0] = 1;
    }

}