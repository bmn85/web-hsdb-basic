package ru.bmn.web.hsdb.site.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.bmn.web.hsdb.model.entity.app.User;
import ru.bmn.web.hsdb.model.repository.app.UserRepository;

@Service
public class HsdbUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String name)
		throws UsernameNotFoundException
	{
		User user = userRepository.findFirstByName(name);

		if (user == null) {
			throw new UsernameNotFoundException(
				String.format("User '%s' not found", name)
			);
		}

		return new HsdbUserDetails(user);
	}
}
