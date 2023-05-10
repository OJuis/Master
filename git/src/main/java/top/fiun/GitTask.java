package top.fiun;

import org.eclipse.jgit.api.Git;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class GitController {
    private GitHub gitHubAccount;
    private GHRepository originalRepository;
    private GHRepository ownRepository;
    private Git localWorkplace;
}
