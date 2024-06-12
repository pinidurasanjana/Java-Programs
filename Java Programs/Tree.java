public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;


    Tree(double heightFt,double trunkDiameterInches,TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    Void grow(){
        this.heightFt = this.heightFt + 10 ;
        this.trunkDiameterInches = this.trunkDiameterInches +1;
        return null;
    }
}
