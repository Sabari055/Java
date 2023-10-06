class Switch{
    public static void main(String[]args)
    {
        String day="Monday";

        switch(day)
        {
            case "Saturday","Sunday":
                System.out.println("No Alarm");
                break;

            case "Monday":
                System.out.println("7Am");
                break;

            default:
                System.out.println("8Am");
                break;
        }
    }
}