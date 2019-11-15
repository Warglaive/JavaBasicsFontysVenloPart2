/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warglaive
 */
public class ParticipantFactory {

    public ParticipantFactory() {

    }

    public Participant CreateParticipant(String name) {
        return new Participant(name);
    }
}
