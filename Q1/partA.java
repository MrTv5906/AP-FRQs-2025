//Part A
public int walkDogs(int hour){
    //establish amount of dogs available at DogWalkCompany
    int numDogs = company.numAvaialableDogs();

    // if walker can walk more dogs than available
    if(maxDogs > numDOgs){
        company.updateDogs(hour, numDogs);
        return numDogs;
    } 
    //if there are more dogs than the walker can handle
    else {
        company.updateDogs(hour, maxDogs);
        return maxDogs;
    }
}
