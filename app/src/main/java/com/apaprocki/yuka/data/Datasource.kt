package com.apaprocki.yuka.data
import com.apaprocki.yuka.model.Product

class Datasource {
    fun loadProducts() : Array<Product>{
        return arrayOf<Product>(
                Product(1,"Petits pois", "Cassegrain", "34567890","A","https://media.istockphoto.com/photos/green-peas-picture-id692622154?k=20&m=692622154&s=612x612&w=0&h=ZXrEli1wpDsbn0jN4oGQuGU900wU5GOTIRhi1-sPCZ8=","400","France, Italie, Chine","des pettis poids et pleins d'autre choses !","Aucune","Aucun"),
                Product(2,"Carottes", "Bonduel", "3475689YUGH","B","https://www.graines-semences.com/2404/carotte-dete-de-nantes.jpg","300","France, Italie, Chine","De la terre entre autre. Cela peut aider...","Aucune","Aucun"),
                Product(3,"Pâtes", "Panzani", "ERSR67TF","C","https://previews.123rf.com/images/fonzie26/fonzie261104/fonzie26110400034/9334670-wallpaper-de-produit-p%C3%A2tes-crues-tordu-.jpg","245","France, Italie, Chine","C'est une bonne question mais c'est bon !","Aucune","Aucun"),
                Product(4,"Cocombre", "Healthy", "E5469R78TRTD","D","https://www.aprifel.com/wp-content/uploads/2019/02/fond-concombre.jpg","240","France, Italie, Chine","De l'eau. Beaucoup d'eau","Aucune","Aucun"),
                Product(5,"Chocolat", "Bannania", "S56D897FT","E","https://img.passeportsante.net/1000x526/2021-05-03/i102005-chocolat-nu.jpg","300","France, Italie, Chine","l'important c'est le savoir-faire","Aucune","Aucun"),
        )

    }
}