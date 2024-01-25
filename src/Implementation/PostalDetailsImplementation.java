package Implementation;

import Enums.PostSIze;
import Enums.PostType;

public class PostalDetailsImplementation {
    public static int calculatePrice(PostType postType, PostSIze postSize){
        if(postSize.equals(PostSIze.Large) && postType.equals(PostType.regular))
            return  100;
        return 30;
    }

}
