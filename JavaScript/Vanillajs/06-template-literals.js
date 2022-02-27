const kitap = {ad: "Firtina", yazar: "Shakespeare", tarih: 1610};

const bookTable = `<table border>
<tbody>
    <tr>
        <td> Kitap </>
        <td> ${kitap.ad} </>
    </tr>
    <tr>
        <td> Yazar </>
        <td> ${kitap.yazar} </>
    </tr>
    <tr>
        <td> Tarih </>
        <td> ${kitap.tarih} </>
    </tr>
</tbody>
</table>`
document.body.innerHTML = bookTable;