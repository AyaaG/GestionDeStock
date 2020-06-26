<%@taglib uri ="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Produits</title>
<link rel="stylesheet" type ="text/css" href="css/style.css"/>
</head>
<body>
<div>
<s:form action="save" method="post">
<s:textfield label="Code du produit" name="produit.codePdt"></s:textfield>
<s:textfield label="Quantite du produit" name="produit.qtePdt"></s:textfield>
<s:textfield key="nomPdt.label" name="produit.nomPdt"></s:textfield>
<s:textfield label="Description du produit" name="produit.descPdt"></s:textfield>
<s:textfield label="Prix du produit" name="produit.prixPdt"></s:textfield>
<s:hidden name="editMode"></s:hidden>
<s:submit value="Enregistrer"></s:submit>
</s:form>
</div>
<div>
<table class ="table1">
<tr>
<th>Code du produit</th><th>Quantite du produit</th><th>Nom du produit</th><th>Description du produit</th><th>Prix du produit</th>
</tr>
<s:iterator value="produits">
<tr>
<td><s:property value ="codePdt"/></td>
<td><s:property value ="qtePdt"/></td>
<td><s:property value ="nomPdt"/></td>
<td><s:property value ="descPdt"/></td>
<td><s:property value ="prixPdt"/></td>
<s:url namespace="/" action="delete" var="lien1">
<s:param name="code">
<s:property value="codePdt"/>
</s:param>
</s:url>
<s:url namespace="/" action="edit" var="lien2">
<s:param name="code">
<s:property value="codePdt"/>
</s:param>
</s:url>
<td><s:a href="%{lien1}">Supprimer</s:a></td>
<td><s:a href="%{lien2}">Modifier</s:a></td>

</tr>
</s:iterator>
</table>
</div>
</body>
</html>
