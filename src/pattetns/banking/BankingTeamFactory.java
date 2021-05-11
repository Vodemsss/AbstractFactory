package pattetns.banking;
import pattetns.Developer;
import pattetns.ProjectManager;
import pattetns.ProjectTeamFactory;
import pattetns.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();

    }
    @Override
    public Tester getTester() {
        return new QATester();
    }
    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
