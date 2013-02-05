package hudson.cli;

import hudson.Extension;
import jenkins.model.Jenkins;

/**
 * Prints the current session ID number (that changes for every run)
 * to allow clients to reliably wait for a restart.
 *
 * @author Kohsuke Kawaguchi
 */
@Extension
public class SessionIdCommand extends CLICommand {
    @Override
    public String getShortDescription() {
        return "Outputs the session ID, which changes every time Jenkins restarts";
    }

    protected int run() {
        stdout.println(Jenkins.SESSION_HASH);
        return 0;
    }
}

