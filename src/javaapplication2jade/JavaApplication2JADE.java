/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2jade;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

/**
 *
 * @author user
 */
public class JavaApplication2JADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws StaleProxyException, InterruptedException {
        // TODO code application logic here
        final jade.core.Runtime runTime = jade.core.Runtime.instance();
        runTime.setCloseVM(true);
        Profile mainProfile = new ProfileImpl(true);
        AgentContainer mainContainer = runTime.createMainContainer(mainProfile);
        AgentController rma = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
        rma.start();
        Thread.sleep(900);


        Profile anotherProfile;
        AgentContainer anotherContainer;
        AgentController agent;

        anotherProfile = new ProfileImpl(false);
        anotherContainer = runTime.createAgentContainer(anotherProfile);
        System.out.println("Starting up a Manager...");
        agent = anotherContainer.createNewAgent("manager", "javaapplication2jade.Agents.Manager", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a MIN_MAX...");
        agent = anotherContainer.createNewAgent("minmax1", "javaapplication2jade.Agents.MIN_MAX", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a MIN_MAX...");
        agent = anotherContainer.createNewAgent("minmax2", "javaapplication2jade.Agents.MIN_MAX", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a MIN_MAX...");
        agent = anotherContainer.createNewAgent("minmax3", "javaapplication2jade.Agents.MIN_MAX", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a MIN_MAX...");
        agent = anotherContainer.createNewAgent("minmax4", "javaapplication2jade.Agents.MIN_MAX", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a Deviation...");
        agent = anotherContainer.createNewAgent("Deviation1", "javaapplication2jade.Agents.Deviation", null);
        agent.start();
        Thread.sleep(900);
        agent = anotherContainer.createNewAgent("Deviation2", "javaapplication2jade.Agents.Deviation", null);
        agent.start();
        Thread.sleep(900);
        agent = anotherContainer.createNewAgent("Deviation3", "javaapplication2jade.Agents.Deviation", null);
        agent.start();
        Thread.sleep(900);
        agent = anotherContainer.createNewAgent("Deviation4", "javaapplication2jade.Agents.Deviation", null);
        agent.start();
        Thread.sleep(900);
        System.out.println("Starting up a Deviation...");
        agent = anotherContainer.createNewAgent("client", "javaapplication2jade.Agents.Client", null);
        agent.start();
        Thread.sleep(900);

    
    }
    
}
