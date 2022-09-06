  val alphabet = "abcdefghijklmnopqrstuvwxyz"
  //alphabet is in lower case therefore all letters
  //in the string should be converted to lower case before calculating new index

  val E = (c: Char, key: Int, a: String) => a((a.indexOf(c.toLower) + key) % a.length) //Encryption function
  val D = (c: Char, key: Int, a: String) => a(((a.indexOf(c.toLower) - key) % a.length)) //Decryption function

  val cipher = (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algo(_, key, a))

  val ct = cipher(E, "s", 5, alphabet)
  val pt = cipher(D, ct, 5, alphabet)
  val ct2 = cipher(E, "abcd", 5, alphabet)
  val pt2 = cipher(D, ct2, 5, alphabet)
  println("Cyphering and decyphering a single letter:")
  println(ct)
  println(pt)
  println("Cyphering and decyphering a string:")
  println(ct2)
  println(pt2)
