/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer22;

/**
 *
 * @author User
 */
public class JobSearch {

    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();

        Observer firstSubscriber = new Subscriber("Jelena Petrova");
        Observer secondSubscriber = new Subscriber("tim Hex");
        Observer thirdSubscriber = new Subscriber("Aaron Gimp");

        Observer fourSubscriber = new Subscriber("Bob Luk");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);
        jobSite.addObserver(fourSubscriber);

        jobSite.addVacancy("Java developer in Tallinn");
        jobSite.addVacancy("Java developer in Berlin");
        jobSite.addVacancy("Java developer in Riga");
        jobSite.addVacancy("Java developer in Sillamae");
        

        jobSite.removeVacancy("Java developer in Tallinn");
        jobSite.removeVacancy("Java developer in Riga");
    }
}
