import java.util.ArrayList;
import java.util.Collections;

class VolunteerTeam
{
    private int totalTeamDeliveries;
    private double totalTeamWages;

    final private ArrayList<VolunteerData> listOfVolunteers = new ArrayList<>();
    //The ArrayList library is used to store all the objects in an array.
    //This allows me to use a loop to call the getter methods of each
    //object in the list rather than recalling the same methods for each object.

    //Private variables used to practice encapsulation.
    //The following methods are used to get and set the variables for secure user access.

    public ArrayList<VolunteerData> getListOfVolunteers()
    {
        return listOfVolunteers;
    }

    public int getTotalTeamDeliveries()
    {
        return totalTeamDeliveries;
    }

    public double getTotalTeamWages()
    {
        return totalTeamWages;
    }

    public void setListOfVolunteers(VolunteerData volunteers) { this.listOfVolunteers.add(volunteers); }

    public void setTotalTeamDeliveries(int totalTeamDeliveries)
    {
        this.totalTeamDeliveries += totalTeamDeliveries;
    }

    public void setTotalTeamWages(double totalTeamWages)
    {
        this.totalTeamWages += totalTeamWages;
    }

    public void sortTeam()
    {
        Collections.sort(this.listOfVolunteers);
    }
    //Sorts the list of volunteers using the overridden compareTo method defined in VolunteerData.
}
