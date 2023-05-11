package top.fiun;

import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;

import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class GitTask {
    private GitHub gitHubConnection;
    private Account account;
    private GHRepository originalRepository;
    private GHRepository ownRepository;
    private Git localWorkplace;

    public GitTask(GitHub gitHubConnection, Account account, URI originalURI) {
        this.gitHubConnection = gitHubConnection;
        this.account = account;
    }

    public void commitLocalChange(String message) throws GitAPIException {
        CommitCommand command = localWorkplace.commit();
        command.setCommitter(this.account.getUserName(),this.account.getEmail());
        command.setMessage(message);
        command.call();
    }

    public void pullFromOriginalRepository() throws IOException {
        this.ownRepository = this.originalRepository.fork();

        // pull
    }

    public void pushToOriginalRepository() {
        // push
        // commit PR
    }

    public void pushToOriginalRepository(String message) throws GitAPIException {
        this.commitLocalChange(message);
    }

    public void submitIssue(String title,String message) throws IOException {
        GHIssueBuilder issueBuilder = this.originalRepository.createIssue(title);
        issueBuilder.assignee(gitHubConnection.getUser(gitHubConnection.getMyself().getLogin()));
        issueBuilder.body(message);
    }
}
