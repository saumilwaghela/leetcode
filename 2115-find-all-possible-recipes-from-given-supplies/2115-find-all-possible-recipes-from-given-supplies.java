class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet <String> availableSupplies = new HashSet<String>(Arrays.asList(supplies));
        HashSet <String> foundRecipe = new HashSet<String>();
        
        int newRecipeFound;
        do{
            newRecipeFound = 0;
            searchNextRecipe:
            for(int i=0;i<recipes.length;i++){
                if(foundRecipe.contains(recipes[i])) continue;
                List<String> requiredSuppliesForRecipe = ingredients.get(i);
                
                for(String supply:requiredSuppliesForRecipe){
                    if(!availableSupplies.contains(supply)) continue searchNextRecipe;
                }
                
                foundRecipe.add(recipes[i]);
                availableSupplies.add(recipes[i]);
                newRecipeFound++;
            }
        }while(newRecipeFound != 0 );
        
        return new ArrayList<String>(foundRecipe);
//         Set<String> availableSupplies=new HashSet<>(Arrays.asList(supplies));
//         Set<String>foundRecipe=new HashSet<>();

//         for(int i=0;i<ingredients.size();i++){
//             outer:
//             for(int j=0;j<ingredients.size();j++){
//                 if(foundRecipe.contains(recipes[j]))continue;
//                 for(String ingredient:ingredients.get(j)){
//                     if(!availableSupplies.contains(ingredient))continue outer;
//                 }
//                 foundRecipe.add(recipes[j]);
//                 availableSupplies.add(recipes[j]);
//             }

//         }
//         return new ArrayList<String>(foundRecipe);
    }
}