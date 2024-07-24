package eqls;

import java.util.Objects;

public class Product {
	
		 int pId;
		 String pName;
		 
		 public Product(int pId,String pName) {
			 this.pId=pId;
			 this.pName=pName;
		 }
		@Override
		public int hashCode() {
			return Objects.hash(pId, pName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return pId == other.pId && Objects.equals(pName, other.pName);
		}
		
		 
		}


