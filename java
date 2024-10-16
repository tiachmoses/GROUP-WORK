document.getElementById('company-form').addEventListener('submit', function(event) {
    event.preventDefault();  

  
    const companyName = document.getElementById('name').value;
    const companyEmail = document.getElementById('email').value;
    const companyPhone = document.getElementById('phone').value;
    const companyDescription = document.getElementById('description').value;

    
    document.getElementById('companyName').textContent = `Company Name: ${companyName}`;
    document.getElementById('companyEmail').textContent = `Email Address: ${companyEmail}`;
    document.getElementById('companyPhone').textContent = `Contact Number: ${companyPhone}`;
    document.getElementById('companyDescription').textContent = `Description: ${companyDescription}`;

  
    document.getElementById('result').style.display = 'block';
});
