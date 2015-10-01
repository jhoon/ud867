package pe.jota.library.wizard;

import pe.jota.library.smith.JokeSmith;

public class JokeWizard {
    public String getJoke(){
        JokeSmith jSmith = new JokeSmith();
        return "The Wizard tells you: " + jSmith.getJoke();
    }
}
