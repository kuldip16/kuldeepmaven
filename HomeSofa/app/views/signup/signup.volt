
{{ content() }}

<div class="page-header">
    <h2>Register</h2>
    <ul class="pager">
        <li class="pull-right">
            {{ link_to("login", "Cancel") }}
        </li>
    </ul>
</div>
<div class="row">
    {{ form('registrieren', 'id': 'registerForm', 'class':'col-md-7', 'onbeforesubmit': 'return false') }}

        <fieldset>

            {% for element in form %}
                
                    <div class="form-group">
                        {{ element.label() }}
                        {{ element.render(['class': 'form-control']) }}
                    </div>
          
            {% endfor %}

            <div class="form-actions">
                {{ submit_button('Register', 'class': 'btn btn-primary') }}
                <p class="help-block">By signing up, you accept terms of use and privacy policy.</p>
            </div>

        </fieldset>
    </form>
</div>
