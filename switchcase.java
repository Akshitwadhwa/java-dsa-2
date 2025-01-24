public class switchcase {
    public static void main(String[] args) {
        boolean leapyear=true;
        int days = 0;
        for(int month =1;month <= 12; month++)
        {
            switch(month)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                days += 30;
                break;
    

                case 2:
              if (leapyear){
                    days +=29;
                } else{
                    days +=28;
                }

                break;
                default:
                
                break;

            }
        }
        System.out.println("Total days in the year: " + days);
    }
    
}
// explaning this code.
