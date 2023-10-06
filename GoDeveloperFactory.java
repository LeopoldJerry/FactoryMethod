public class GoDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new GoDeveloper();
    }
}
