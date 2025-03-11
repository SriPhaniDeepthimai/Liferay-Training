<%@ include file="/init.jsp" %>

<h2>Liferay Portlet Example</h2>

<!-- Render Phase -->
<form action="<portlet:actionURL name='submitForm' />" method="post">
    <label>Enter Your Name:</label>
    <input type="text" name="userName" required />
    <button type="submit" onClick="submitHandler()">Submit</button>
</form>

<!-- Button for ServeResource -->
<button onclick="fetchUserData()">Get User Name</button>
<p id="userData"></p>

<script>
    function submitHandler(e){
    	e.target.preventDefault(e)
    }
    
    function fetchUserData() {
        fetch('<portlet:resourceURL />', { headers: { 'Accept': 'text/plain' } })
            .then(response => response.text())
            .then(data => document.getElementById("userData").innerHTML = data);
    }
</script>
