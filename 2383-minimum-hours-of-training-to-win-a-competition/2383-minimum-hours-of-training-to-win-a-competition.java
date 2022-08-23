class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int minHoursOfPracticeNeeded = 0;
        int currentEnergy = initialEnergy;
        int currentExperience = initialExperience;
        for(int i=0;i<energy.length;i++){
            if(energy[i]>=currentEnergy){
                minHoursOfPracticeNeeded += energy[i]-currentEnergy+1;
                currentEnergy += energy[i]-currentEnergy+1;
            }
            if(experience[i]>=currentExperience){
                minHoursOfPracticeNeeded += experience[i]-currentExperience+1;
                currentExperience += experience[i]-currentExperience+1;
            }
            currentEnergy -=energy[i];
            currentExperience +=experience[i];
            //System.out.println(i+"  currentEnergy="+currentEnergy+"   currentExperience="+currentExperience+"   minHoursOfPracticeNeeded="+minHoursOfPracticeNeeded);
        }
        return minHoursOfPracticeNeeded;
    }
}