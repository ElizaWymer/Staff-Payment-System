import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        VolunteerTeam volunteerTeam = new VolunteerTeam();
        //The whole team of volunteers represented as described in task 3 of the assignment brief.

        VolunteerData Bob = new VolunteerData();
        Bob.SetName("Bob");
        Bob.SetWage(100);
        volunteerTeam.setListOfVolunteers(Bob);
        //The first volunteer represented as described in task 1 of the assignment brief.

        VolunteerData Mary = new VolunteerData();
        Mary.SetName("Mary");
        Mary.SetWage(122);
        volunteerTeam.setListOfVolunteers(Mary);

        VolunteerData Alex = new VolunteerData();
        Alex.SetName("Alex");
        Alex.SetWage(32);
        volunteerTeam.setListOfVolunteers(Alex);
        //Objects representing the second and third volunteers  as described in task 2 of the assignment brief.
        //One of which has delivered less than fifty boxes to showcase that they do not get the 20p bonus.

        VolunteerData Sofya = new VolunteerData();
        Sofya.SetName("Sofya");
        Sofya.SetWage(127);
        volunteerTeam.setListOfVolunteers(Sofya);

        VolunteerData Steve = new VolunteerData();
        Steve.SetName("Steve");
        Steve.SetWage(46);
        volunteerTeam.setListOfVolunteers(Steve);

        VolunteerData Muhammed = new VolunteerData();
        Muhammed.SetName("Muhammed");
        Muhammed.SetWage(273);
        volunteerTeam.setListOfVolunteers(Muhammed);

        VolunteerData Amaara = new VolunteerData();
        Amaara.SetName("Amaara");
        Amaara.SetWage(129);
        volunteerTeam.setListOfVolunteers(Amaara);

        VolunteerData John = new VolunteerData();
        John.SetName("John");
        John.SetWage(129);
        volunteerTeam.setListOfVolunteers(John);

        VolunteerData Tony = new VolunteerData();
        Tony.SetName("Tony");
        Tony.SetWage(17);
        volunteerTeam.setListOfVolunteers(Tony);
        //Objects representing the volunteers described in task 3 of the assignment brief.

        Sofya.SetWage(13);
        Steve.SetWage(9);
        Muhammed.SetWage(27);
        Amaara.SetWage(33);
        John.SetWage(39);
        Tony.SetWage(106);
        //My software already allowed the number of test kits delivered
        //to be increased and did not need to be enhanced in that aspect.
        //As such, I have increased the number of deliveries by volunteers
        //as described in task 4 of the assignment brief.

        VolunteerLeaders Elizabeth = new VolunteerLeaders();
        Elizabeth.SetName("Elizabeth");
        Elizabeth.SetWage(129);
        volunteerTeam.setListOfVolunteers(Elizabeth);

        VolunteerLeaders Sarah = new VolunteerLeaders();
        Sarah.SetName("Sarah");
        Sarah.SetWage(385);
        volunteerTeam.setListOfVolunteers(Sarah);

        //Team leader objects as described in task 6.
        //SetWage has been overridden to provide a 20% bonus.
        //toString has been overridden to output 'Team Leader' before the team leaders name.

        DecimalFormat wageFormat = new DecimalFormat("£#0.00\n\n");
        //The DecimalFormat library is used to set the format of the volunteer's wage.
        //It places a pound sign before the wage and ensures that the wage is rounded to two decimal places.

        volunteerTeam.sortTeam();
        //Volunteers sorted by the number of test kits delivered and then by name as described in task 5.

        volunteerTeam.getListOfVolunteers().forEach(volunteer->
                {
                    System.out.printf(volunteer.toString() + ":\n  Number of Deliveries: "
                                           + volunteer.getNumberOfDeliveries() + "\n  Wage: "
                                           + wageFormat.format(volunteer.getWage()));

                    volunteerTeam.setTotalTeamDeliveries(volunteer.getNumberOfDeliveries());
                    volunteerTeam.setTotalTeamWages(volunteer.getWage());
                }
        );

        //The above foreach loop iterates through an array of the volunteers in the team,
        //getting and printing their names and wages as described in task 3.

        //It also sets the values of the total deliveries made and wages that
        //need to be made by accessing the get methods of the VolunteerData objects
        //which are stored in an array from the VolunteerTeam class as described in task 3.

        System.out.printf("Total number of test kits delivered: " + volunteerTeam.getTotalTeamDeliveries());
        System.out.printf("\nTotal amount of money to be paid: " + wageFormat.format(volunteerTeam.getTotalTeamWages()));
        //Outputs the total number of test kits delivered and the total amount of money due to be paid.
    }
}