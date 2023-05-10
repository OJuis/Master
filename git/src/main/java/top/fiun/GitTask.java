package top.fiun;

import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class GitTask {
    private GitHub gitHubAccount;
    private GitAccount gitAccount;
    private GHRepository originalRepository;
    private GHRepository ownRepository;
    private Git localWorkplace;

    public GitTask(GitHub gitHubAccount,GitAccount gitAccount) {
        this.gitHubAccount = gitHubAccount;
        this.gitAccount = gitAccount;
    }

    public void commitLocalChange(String message) throws GitAPIException {
        CommitCommand command = localWorkplace.commit();
        command.setCommitter(this.gitAccount.getName(),this.gitAccount.getEmail());
        command.setMessage(message);
        command.call();
    }

    public void getFromOriginalRepository() {
        // fork
        // pull
    }

    public void commitToOriginalRepository() {
        // push
        // commit PR
    }

    public void commitToOriginalRepository(String message) throws GitAPIException {
        this.commitLocalChange(message);
    }

    public void issue(String message) {}
}
