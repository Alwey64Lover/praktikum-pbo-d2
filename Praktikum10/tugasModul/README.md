# List
## Kelebihan
1. List menyimpan urutan elemen saat dimasukkan.
2. List membolehkan adanya duplikat.
## Kekurangan
1. Operasi seperti penyisipan dan penghapusan bisa lambat jika melibatkan pemindahan elemen, terutama dalam list besar.
2. Menyimpan data sejumlah besar dalam list bisa memakan banyak memori.
3. Mencari elemen bisa lambat karena mungkin memerlukan pemindaian seluruh list.

# Set
## Kelebihan
1. Set mencegah duplikat.
2. Pengujian keanggotaan cepat karena implementasi  tabel hash yang mendasarinya.
## Kekurangan
1. Set umumnya memerlukan lebih banyak memori karena overhead struktur tabel hash.
2. Beberapa operasi yang bergantung pada urutan, seperti slicing atau menemukan elemen ke-n, tidak mungkin atau tidak efisien dengan set.

# Map
## Kelebihan
1. Map menyimpan data dalam pasangan kunci-nilai, memungkinkan pengambilan data yang efisien berdasarkan kunci unik.
2. Kunci dapat berupa berbagai jenis, memberikan fleksibilitas dalam cara data diindeks.
3. Pencarian, penyisipan, dan penghapusan umumnya sangat cepat karena implementasi tabel hash.
## Kekurangan
1. Map memiliki overhead memori yang signifikan karena penyimpanan kunci, nilai, dan struktur tabel hash.
2. Dalam banyak implementasi, pasangan kunci-nilai tidak terurut.
3. Lebih kompleks daripada list dan set.