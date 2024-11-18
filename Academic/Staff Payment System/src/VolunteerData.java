class VolunteerData implements Comparable<VolunteerData>
{
    private String name;
    private int numberOfDeliveries;
    private double wage;

    //Private variables used to practice encapsulation.
    //The following methods are used to get and set the variables for secure user access.

    public String getName()
    {
        return name;
    }
    public int getNumberOfDeliveries() { return numberOfDeliveries; }
    public double getWage()
    {
        return wage;
    }

    public void SetName(String newName)
    {
        this.name = newName;
    }

    public void SetWage(int numberOfBoxesDelivered)
    {
        int numSubtracted = 0;
        if (numberOfBoxesDelivered > 0 && numberOfBoxesDelivered <= 400)
        {
            while (numberOfBoxesDelivered > 50)
            {
                this.wage += 0.20;
                numberOfBoxesDelivered -= 1;
                numSubtracted += 1;
            }
            this.numberOfDeliveries += numberOfBoxesDelivered + numSubtracted;
            this.wage += numberOfBoxesDelivered * 0.15;
        }
        else
        {
            System.err.printf("\nThe value set for " + this.name + "'s number of delivered boxes is not sensible.");
            System.err.printf("\nPlease choose a more appropriate value that is between 0 and 300.\n");
        }
        //The if statement checks whether the value passed is sensible as described in task 4.
        //If it is larger than 0 and less than or equal to 300 the value is accepted.
        //Otherwise, the software tells the user that the value entered is inappropriate.
        //There is no need to check the validity of the type of the value entered as the Java compiler doesn't
        //allow values other than integers to be passed due to the type of the parameter set in the method.

        //The while loop checks if the number of boxes is greater than fifty.
        //If the number of boxes delivered is greater than fifty then the volunteer
        //gets paid 20p for each box that contributed to the total being greater than fifty.
        //The method appends the value of deliveries by the number of boxes delivered.
        //They are then paid 15p for the last fifty boxes that they delivered. If the volunteer
        //delivered less than fifty boxes they are only paid 15p for every box delivered.
    }

    @Override
    public String toString()
    {
        return String.format(getName());
    }
    //Ensures that VolunteerData objects with the toString method called returns the name of the volunteer.

    @Override
    public int compareTo(VolunteerData volunteer)
    {
        if (volunteer.getNumberOfDeliveries() == this.numberOfDeliveries)
        {
            return this.name.compareTo(volunteer.name);
        }
        else
        {
            return volunteer.numberOfDeliveries - this.numberOfDeliveries;
        }
    }
    /*
        The overridden CompareTo method sorts the volunteers by the number of test kits delivered and ensures that if the
        number of test kits delivered by a volunteer are equal to that of another volunteers then those volunteers are
        sorted alphabetically.
    */
}
