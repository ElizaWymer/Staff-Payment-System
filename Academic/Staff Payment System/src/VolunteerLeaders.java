class VolunteerLeaders extends VolunteerData
{
    @Override
    public double getWage()
    {
        return super.getWage() * 1.2;
    }
    //Returns the VolunteerData getWage method and provides a
    //20% bonus by multiplying the value of their base wage by 1.2

    @Override
    public String toString()
    {
        return String.format("Team Leader " + super.getName());
    }
    //Ensures that VolunteerLeader objects with the toString method called returns
    //the name of the volunteer preceded by the title 'Team Leader' before their name.

}
