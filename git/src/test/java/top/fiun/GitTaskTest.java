package top.fiun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class GitTaskTest {
    GitHub gitHub = new GitHubBuilder().withPassword("Start-Debug","20070111wec").build();
    Account account = new Account("Start-Debug","2717322898@qq.com",null);
    GitTask task = new GitTask(gitHub,account,new URI("https://github.com/OJuis/test.git"));

    GitTaskTest() throws IOException, HashException, URISyntaxException {}

    @BeforeEach
    void beforeEach() throws IOException {

    }

    @Test
    void commitLocalChange() {
    }

    @Test
    void pullFromOriginalRepository() {
    }

    @Test
    void pushToOriginalRepository() {
    }

    @Test
    void testPushToOriginalRepository() {
    }

    @Test
    void submitIssue() {

    }
}