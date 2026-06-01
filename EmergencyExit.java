public class EmergencyExit {
    public static void main(String[] args) {
        int dynamicValue = 10;
        while (dynamicValue > 0) {
            if (dynamicValue < 5)
                break;
            else if (dynamicValue % 2 == 0) {
                dynamicValue--;
                continue;
            } else
                System.out.println(dynamicValue);
            dynamicValue--;
        }
    }
}
