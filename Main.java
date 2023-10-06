
public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("GO");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specilty){
        if (specilty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specilty.equalsIgnoreCase("kotlin")) {
            return new KotlinDeveloperFactory();
        } else if (specilty.equalsIgnoreCase("go")) {
            return new GoDeveloperFactory();
        } else {
            throw new RuntimeException(specilty + " is unknown specialty.");
        }
    }
}