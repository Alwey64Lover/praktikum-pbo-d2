{Terjemahkan ke bahasa Java}
class Kupu has 
  procedure gerak()
class Ulat inherits Kupu has 
  procedure gerak() 
    output "ulat merayap"
class Kepompong inherits Kupu has 
  procedure gerak() 
    output "kepompong diam"
class KupuDewasa inherits Kupu has 
  procedure gerak() 
    output "kupu terbang"
class Data<T> has 
  isi is T
  function getIsi() -> T
     -> this.isi 
  procedure setIsi( input x : T )  
     this.isi <- x
class Main 
  {kamus}
  K : Ulat 
  anu : Data<Kupu>
  {algoritma}
  K <- new Ulat
  anu <- new Data<>()
  anu.setIsi(K)
  anu.getIsi().gerak()
  anu.setIsi( new Kepompong )
  anu.getIsi().gerak()
  anu.setIsi( new KupuDewasa )
  anu.getIsi().gerak()
  
  
 