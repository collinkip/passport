import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        passport ukPassport=new passport("1234", LocalDate.of(2025, 12, 12));
        passport kenyaPassport=new passport("34596", LocalDate.of(2025, 05, 06));
        passport sudanPassport=new passport("9876", LocalDate.of(2023, 2, 26));
        System.out.println(" Uk Passport");
        System.out.println(ukPassport.number);
   
    } 
    static class passport{
        String number;
        LocalDate expiryDate;

        passport(String number, LocalDate expiryDate){
            this.number=number;
            this.expiryDate=expiryDate;
        }

    }
}
git remote add origin https://github.com/collinkip/passport.git
git branch -M master
git push -u origin master