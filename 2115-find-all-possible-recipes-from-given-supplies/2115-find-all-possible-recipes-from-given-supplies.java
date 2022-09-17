class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> availableSupplies=new HashSet<>(Arrays.asList(supplies));
        Set<String>foundRecipe=new HashSet<>();

        for(int i=0;i<ingredients.size();i++){
            outer:
            for(int j=0;j<ingredients.size();j++){
                if(foundRecipe.contains(recipes[j]))continue;
                for(String ingre:ingredients.get(j)){
                    if(!availableSupplies.contains(ingre))continue outer;
                }
                foundRecipe.add(recipes[j]);
                availableSupplies.add(recipes[j]);
            }

        }
        return new ArrayList<String>(foundRecipe);
    }
}