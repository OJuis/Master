package top.fiun;

import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;

import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class GitTask {
    private GitHub gitHubConnection;
    private Account account;
    private GHRepository originalRepository;
    private GHRepository ownRepository;
    private Git localWorkplace;
    private File localStorage;

    public GitTask(GitHub gitHubConnection, Account account, URI originalURI, File localStoragePath) throws IOException {
        this.gitHubConnection = gitHubConnection;
        this.account = account;
        this.localStorage = new File(localStoragePath.getAbsoluteFile()+"/.git");
        this.localWorkplace = new Git(new FileRepository(this.localStorage));
    }

    public void commitLocalChange(String message) throws GitAPIException {
        CommitCommand command = localWorkplace.commit();
        command.setCommitter(this.account.getUserName(),this.account.getEmail());
        command.setMessage(message);
        command.call();
    }

    public void pullFromOriginalRepository() throws IOException {
        // fork
        this.ownRepository = this.originalRepository.fork();
        // pull
        localWorkplace.pull().setRemote(ownRepository.getHtmlUrl().toString());
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

    private void downLoadRemoteRepository(URI remoteRepositoryURI) {

    }
}
