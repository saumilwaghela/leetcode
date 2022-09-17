class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List <String> availableSupplies = new ArrayList<String>(Arrays.asList(supplies));
        HashSet <String> foundRecipe = new HashSet<String>();
        Set<String> supple=new HashSet<>(Arrays.asList(supplies));
        Set<String>ans=new HashSet<>();

        for(int i=0;i<ingredients.size();i++){
            outer:
            for(int j=0;j<ingredients.size();j++){
                if(ans.contains(recipes[j]))continue;//recipe has already been made
                for(String ingre:ingredients.get(j)){
                    if(!supple.contains(ingre))continue outer;//As all ingredients are not present in supplies
                }
                ans.add(recipes[j]);// add it to the answer
                supple.add(recipes[j]); //add it to the supplies list so that another recipe can use this recipe
            }

        }
        return new ArrayList<>(ans);
//         int newRecipeFound;
//         do{
//             newRecipeFound = 0;
//             for(int i=0;i<recipes.length;i++){
//                 if(foundRecipe.contains(recipes[i])) continue;
//                 List<String> requiredSuppliesForRecipe = ingredients.get(i);
//                 boolean isAllSuppliesAvaiableForRecipe = true;
                
//                 for(String supply:requiredSuppliesForRecipe){
//                     if(!availableSupplies.contains(supply)){
//                         isAllSuppliesAvaiableForRecipe=false;
//                     }
//                 }
                
//                 if(isAllSuppliesAvaiableForRecipe){
//                     foundRecipe.add(recipes[i]);
//                     availableSupplies.add(recipes[i]);
//                     newRecipeFound++;
//                 }  
//             }
//         }while(newRecipeFound != 0 );
        
//         return new ArrayList<String>(foundRecipe);
    }
}